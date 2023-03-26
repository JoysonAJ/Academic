
let http = require("http")
const upperCase = require('upper-case')
const lowerCase = require('lower-case');

http.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'Text/html'});
    res.write(upperCase.upperCase("hello from the world"))
    res.end(lowerCase.lowerCase("THIS UPPER CASE ONE"))
}).listen(8081);

console.log("Server is Running");