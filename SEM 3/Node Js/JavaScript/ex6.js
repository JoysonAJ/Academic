const result = () =>{
    let str = f1.input1.value
    var obj = {};
    for(let i = 0; i < str.length; i++) {
        if(obj[str[i]]){
            obj[str[i]] += obj[str[i]];
        }else {
            obj[str[i]] = 1;
        }
    }
    // document.getElementById("res").innerHTML=obj[str]
    for(let i = 0; i < str.length; i++) {
        if(obj[str[i]]>1){
            if (str[i] >= '0' && str[i] <= '9') {
                document.write(str[i] +"\t")
            }
        }
    }
}