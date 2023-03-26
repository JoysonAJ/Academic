const fs = require("fs")
const http = require('http')

http.createServer((req,res)=>{
    fs.readFile("aimit.txt",(err,data)=>{
        if(err)
            throw(err)
        else{
            res.writeHead(200,{'content-Type':'text/html'});
            res.write(data);
            return res.end()
        }
    })

    fs.appendFile('aimit.txt','india \t',(err)=>{
        if(err)
            throw err
        else{
            console.log("HELLO AGAIN");
        }
    })
}).listen(3000)