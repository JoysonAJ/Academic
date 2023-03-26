const fs = require("fs");
fs.writeFile("aimit.txt","good-morning",(err) =>{
    if(err)
        throw(err);
    else
    console.log("File has been created ");
})