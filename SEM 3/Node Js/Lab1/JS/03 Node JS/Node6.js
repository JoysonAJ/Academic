const mysql = require("mysql2")
const dbConnection = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:""
})

// CREATING THE CONNECTION
dbConnection.connect( (err) =>{
    if(err)
        throw err;
    console.log("Connected");
})

// CREATING DATA BASE
const sqlDatabase = "CREATE DATABASE IF NOT EXISTS db56 "
dbConnection.query(sqlDatabase,(err,result)=>{
    if(err)
        throw err
    console.log("\n Data Base Created");
})

// CREATING TABLE
const sqlTable = "CREATE TABLE IF NOT EXISTS db56.cust "+
                "(cname varchar(25),c_add varchar(50))"
dbConnection.query(sqlTable,(err,result)=>{
    if(err)
        throw err
    console.log("\n Created data Base");
})

// INSERING RECORD 
const sqlInsert = "INSERT INTO db56.cust VALUES"+
                  "('cust','Manglore')"
dbConnection.query(sqlInsert,(err,result)=>{
    if(err)
        throw err
    console.log("Data Inserted Sucessfully");
})

// RETRIVING THE DATA FROM TABLE
const sqlDisplay = "SELECT * FROM db56.cust"
dbConnection.query(sqlDisplay,(err,result) =>{
    if(err)
        throw err
    console.log(result);
})


// DELETING DATA 
const sqlDelete = "DELETE FROM db56.cust WHERE cname='cust'";
dbConnection.query(sqlDelete,(err,result)=>{
    if(err)
        throw err
    console.log("Successfully deleted "+result.affectedRows+" rows");
})

// MULTIPLE VALUES
const sqlMultiInsert = "INSERT INTO db56.cust VALUES ?"
const values =[
    ['cust1','Manglore'],
    ['cust2','Banglore'],
    ['cust3','Mumbai']
]
dbConnection.query(sqlMultiInsert,[values],(err,result)=>{
    if(err)
        throw err
    console.log("Number record result is"+result.affectedRows);
})

// UPDATE 
const sqlUpdate = "UPDATE db56.cust SET cname='cust33'"+
                  "WHERE c_add='Mumbai'"
dbConnection.query(sqlUpdate,(err,result)=>{
    if(err)
        throw err
    console.log("Updated number rows ="+result.affectedRows);
})