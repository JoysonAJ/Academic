const checkPlaindrome = () => {
    const inputValue = myForm.inputData.value;
    // for string 
    if (inputValue != /[^a-zA-Z]/g) {
        const revserString = inputValue.split("").reverse().join("");
        if(inputValue == revserString){
            document.getElementById("resultSet").innerHTML = "It's Palindrome string"
            return
        }
        document.getElementById("resultSet").innerHTML = "It's no Palindrome string"
    }
}
const numberPlaindrome = ()=>{
    let inputNumber=parseInt(myForm.inputData.value);
    let reverseNumber=0
    let dig
    let temp=inputNumber
    while(no>0){
    dig=inputNumber%10;
    inputNumber=parseInt(inputNumber/10)
    reverseNumber=reverseNumber*10+dig;
    }
    if(reverseNumber==temp)
        document.getElementById("resultSet").innerHTML="PALLINDROME"
    else
        document.getElementById("resultSet").innerHTML="NOT PALLINDROME"
}

const countVowel = ()=>{
    const inputWord = myForm.inputData.value
    const totalVowel = inputWord.match(/[aeiou]/gi).length;
    document.getElementById("resultSet").innerHTML='The number of vowel '+totalVowel
}

const genratePrime = () =>{
    let result= " 2 " ;
    const inputNumber = parseInt(myForm.inputData.value)
    for(let i=2;i<inputNumber;i++){
        let notPrime = false;
        for(let j=2;j<=i;j++){
            if(i%j != 0 && i != j){
                notPrime = true;
                break;
            }else{
                break;
            }
        }
        if(notPrime){
            result = result + ' ' +i;
        }
    }
    document.getElementById("resultSet").innerHTML = result;
}

const checkArmstorng = ()=>{
    const inputNumber = myForm.inputData.value
    let result=0;
    let num;
    for(let i=0;i<inputNumber.length;i++){
        num = parseInt(inputNumber[i])
        result += Math.pow(num,3);
    }

    if(inputNumber == result){
        document.getElementById("resultSet").innerHTML = "It's a Armstrong Number";
    }else{
        document.getElementById("resultSet").innerHTML = "It's  not a Armstrong Number";
    }
}

const stringReverse = ()=>{
    const inputString = myForm.inputData.value;
    const reverseString = inputString.split("").reverse().join("");
    document.getElementById("resultSet").innerHTML = reverseString;
        
}

const genrateFibonoci = ()=>{
    
    const inputnumber = parseInt(myForm.inputData.value)
    let value1 = 0
    let value2 = 1;
    let series;
    let result = value1 +" "+ value2 + " "
    for(let i=1;i<inputnumber;i++){
        
        series =value1+value2
        value1 = value2;
        value2 = series;
        result =result + series+" ";
    }
    
    document.getElementById("resultSet").innerHTML = result;
}

const checkPrime = ()=>{
    let notPrime = false;
    const inputNumber = parseInt(myForm.inputData.value)
    for(let i=2;i<=inputNumber;i++){
        if(inputNumber%i != 0 && inputNumber != j){
            notPrime = true;
            break;
        }else{
            break;
        }
    }

    if(notPrime){
        document.getElementById("resultSet").innerHTML = "Prime Number";
    }else{
        document.getElementById("resultSet").innerHTML = "Not Prime Number";
    }
}

const numberSort = ()=>{
    const inputNumbers = (myForm.inputData.value).split(",")
    const numbersArray = parseInt(inputNumbers)
    console.log(numbersArray);
}

const stringSort = ()=>{
    console.log("HEllo");
}