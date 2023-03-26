const fs = require("fs")
// Reading from file
const readMe =fs.readFileSync('text.txt','utf-8');
console.log("Reading Files");
console.log(readMe);


// Writing
const content = "This Program is read and write file"
fs.writeFile('text.txt',content,(err)=>{
    if(err)
        console.log(err);
    else{
        console.log("\n\n File written successfully \n");
        console.log(fs.readFileSync('text.txt','utf-8'));
    }
});
console.log(`After append result ${readMe}`);

// Append File
fs.appendFile("text.txt","\n Append word",(err)=>{
    if(err)
        throw(err)
    else{
        console.log("\n The Content of files is");
        console.log(fs.readFileSync('text.txt','utf-8'));
    }
})