#!/bin/bash

IFS="="
sedcmd=""
#Build the sed parameters for properties substitutions.
while read -r key value
do
	sedcmd+="s/\[\[${key}\]\]/${value}/;"
done < $1
unset IFS

#Create output directory if needed.
dir=$(dirname ${3})
if [ ${#dir} > 0 ]; then
   $(mkdir -p ${dir})
fi

#Skip the last semi colon.
sedcmd="${sedcmd::-1}"
#echo ${sedcmd}

#Write output file.
sed "${sedcmd}" ${2} > ${3}

exit $?
