const result = () =>{
    let answer = f1.input1.value
    let inputLength = answer.length

    var middle = Math.floor(answer.length/2);
    if((inputLength)%2==0){
        document.getElementById("res").innerHTML="The answer is "+answer[middle -1]+"\t"+answer[middle]
    }else{
        document.getElementById("res").innerHTML="The answer is "+answer[middle]
    }
}