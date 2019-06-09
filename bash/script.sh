if [ "$1" -eq "$1" ] 2>/dev/null
then 
	program_regexp="^"$1"/.+"
else
	program_regexp="^[0-9]+/"$1"$"	
fi

netstat -tlpn | awk -v program=$program_regexp '{if ($1 ~ /tcp(|6)/  && $7 ~ program) {match($4, ".*:(.*)$", addr); print addr[1]} }' | uniq |  tr "\n" "\t"
echo '\n'
