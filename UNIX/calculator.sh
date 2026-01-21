echo "Enter Num1"
read a

echo "Enter Num2"
read b

echo "Enter Operator"
read opr

if [ "$opr" = "+" ]; then
	echo "Result $((a+b))"
elif [ "$opr" = "-" ]; then 
	echo "Result $((a-b))"
elif [ "$opr" = "*" ]; then
	echo "Result $((a*b))"
elif [ "$opr" = "/" ]; then
	echo "Result $((a/b))"
fi
