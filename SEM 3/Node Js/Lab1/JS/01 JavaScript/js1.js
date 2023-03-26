let inputNumber = 0;
const numberClick = (a) =>{
    inputNumber = a;
    calForm.inputValue.value = a;
}

const clearInput = () =>{
    inputNumber = 0;
    previousValue = 0;
    calForm.inputValue.value = 0;
}

let previousValue;
let opr;
const setOperator = (op) =>{
    opr = op;
    previousValue = inputNumber;
    console.log(op);
    console.log(previousValue);
}

const perFormOpr = () =>{
    const value1 = previousValue;
    const value2 = inputNumber;
    const operator = opr;

    switch(operator){
        case '+':
            calForm.inputValue.value = value1+value2;
            break;
        case '-':
            calForm.inputValue.value = value1-value2;
            break;
        case '*':
            calForm.inputValue.value = value1*value2;
            break;
        case '/':
            calForm.inputValue.value = value1/value2;
            break;
    }
}