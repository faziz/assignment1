package com.faziz.subscription;

public class Order {
    
    private String orderDetails;
    private String termsAndConditions;

    /**
     * @return the orderDetails
     */
    public String getOrderDetails() {
        return orderDetails;
    }

    /**
     * @param orderDetails the orderDetails to set
     */
    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    /**
     * @return the termsAndConditions
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * @param termsAndConditions the termsAndConditions to set
     */
    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }    
    
    public static Order createNewMethodWIthJunkValues() {
        Order order = new Order();
        order.setOrderDetails("Order kdjakjdafjasdfjasdfjasdkfjakjfakdsldkasldkas;lkdas;ldkasdasdkas;ldkasd"
                + "asdlkas;ldkasldasdkasdk;askdaslkdalkdla;skdla;sdka;sldkla;skdas;lkd;askda;sklda;slkda;sdka"
                + "asldka;skdasdkas;kldas;dka;sldkal;kda;slkda;slkda;lskdal;skdal;kdakda;kda;kdaskdasdkasdkaskd"
                + "asdkaskda;skda;kda;sdka;skdas;kdaskdakda;kdadka;kda;dka;kda;kdaskdakda;kda;kda;kda;kdaskdask"
                + "asdkas;dkas;kdas;lkda;kda;kda;kda;kda;lkda;lkda;lkda;lkda;lkda;lskda;lskda;ldka;ldkal;sdkalk"
                + "a;sdklasldka;kda;kda;sldka;sdkas;ldka;klda;ldka;lkda;ldka;sldka;skda;skd;asdkaskda;lskdasldk"
                + "asdlkas;ldkas;kd;askd;askd;alkd;alskda;skda;lskda;skda;slkdas;dka;sdka;kda;slkda;skdalsdka;dk"
                + "as;ldkas;ldka;ldkal;skdas;lk;lk;laksd;kas;dkas;ldkas;lkdas;lkdas;lkdas;lkda;slkda;slkda;slkd");
        order.setTermsAndConditions("Terms sadmasdmasdas;ldmmaslmfasmdlsmdasmdasmdaskdkasnw;elkrjewkrjwerkjwe"
                + "ekrjewkrjwekjrwejrwekrjwekrjwekrjnsdfnadksjrwekjrwejkrwekljfskdfcmaskdjrwejrwejd;lasdjfdklfj"
                + "we;lrke;lrkerjwelkrjelrjwqejkrqwelrjkwelrjwejklrwekljrwekjrwejkrwekjrwejkrw;ejkrwekjrqwe;ljkr ,zxMCrjwerjwe;ljkr"
                + "ewrkqwerjweoirweoiurqwoeiurqiowzxc,lcm;klwejrklwejr;kwejlr;kljweq;rlkjqw;klrjw;qelrj;werkljwe;rkjw"
                + "werjkqwerkljqwe;lrjkqw;lrjkqwe;lrjqwe;rjqwe;lrkjqwe;klrjweqlkrjqweklrjqwe;klrj;qwelkrjqw;erjkl"
                + "welrjqw;lerjkqwe;lrjk;qwerj;qwelrj;qwerjqwe;rkjwe;rlkjqwe;lrkjqw;erjkwqe;rkjl"
                + "werjqwelrjq;welrjqwe;lrjqwe;ljkrqwe;lkrjwe;qklrjqwe;rkjweq;krjweq;klrjweqkrlj"
                + "werkjwqerljwqe;lrjqwelkrjqw;lejkrqwe;kljrqwe;lkjrqwe;ljkrwe;qkljrqwe;jrwe;qkrj"
                + "wqekrwqelrkwqerjwe;qkjrwe;kljr;qweljr;qwejr;weqrjkwe;kjwejkrweq;krjqw;erkljwe;lrjw;eqrljwqe;lkrj;lkwer");
        return order;
    }
}
