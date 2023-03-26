const mysql = require("mysql2");
const con = mysql.createConnection({
    host : "localhost",
    user : "root",
    database:"db56"
});

con.connect((err)=>{
    if(err)
        throw err;
    else
        console.log("Connected");
})

// Creating data Base
// const sql = "CREATE DATABASE db56";
// con.query(sql,(err,result)=>{
//     if(err)
//         throw err;
//     else
//         console.log("Data-base Created");
// })

// Creating table

// const sqlTable = "CREATE TABLE db56.cust (cname varchar(25),c_add varchar(50))";
// con.query(sqlTable,(err,result) =>{
//     if(err)
//         throw err
//     console.log("Table Created......");
// })

// Inserting Record

// const sqlInsert = "INSERT INTO db56.cust VALUE('aimit','mangalore')";
// con.query(sqlInsert,(err,result)=>{
//     if(err)
//         throw err;
//     else
//         console.log("Data inserted sucessfull");
// })

// Retriving the records
const sqlDisplay = "SELECT * FROM db56.cust";
con.query(sqlDisplay,(err,result)=>{
    if(err)
        throw err
    console.log(result);
})

// DELETING
// const sqlDelete="delete from db56.cust where address='mada'";
// con.query(sql,(err,result)=>{
// 	if(err) throw err;
// 	console.log("deleted succesfully");
// 	console.log("number of record deleted=="+result.affectedRows);
// });

// UPDATE
// const sql="update mydb45.cust set address='mada' where address='kolya'";
// con.query(sql,(err,result)=>{
// 	if(err) throw err;
// 	console.log("updated succesfully");
// 	console.log("number of record updated=="+result.affectedRows);
// });


// Multiplr values
const sql="INSERT INTO db56.cust values ?";
const values=[
    ['harshitha','mada'],
    ['swasthik','kolya'],
    ['sushmitha','kayyar']
];
con.query(sql,[values],(err,result)=>{
	if(err) throw err;
	console.log("inserted succesfully");
	console.log("number of record inserted=="+result.affectedRows);
});

