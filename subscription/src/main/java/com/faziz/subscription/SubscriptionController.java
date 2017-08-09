package com.faziz.subscription;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubscriptionController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private Truncator truncator;
    
    @RequestMapping("/greetings")
    public String greetings(Model model){
        model.addAttribute("order", Order.createNewMethodWIthJunkValues());
        return "subscription";
    }    

    @RequestMapping(value = "/subscribe", method = RequestMethod.POST)
    public String subscribe(Order order) {
        String orderDetails​= order.getOrderDetails();
        String truncatedOrderDetails = truncator.truncate(orderDetails, 250);
        log(truncatedOrderDetails);

        return "subscribed";
    }

    private void log(String truncatedOrderDetails) {
        logger.info(truncatedOrderDetails);
    }
}
