insert into vendor(id , COMPANY_NAME ,CONTACT_NAME,	LAST_NAME	,WEBSITE,EMAIL,STATUS,GST_NO)
values(1,'testcompany' ,'testcotactname' , 'testlastname' , 'testcompany.com' , 'test@email.com' ,'A','GSTI12343' )


postgre commands to start and stop db
D:\Hani\RnD\postgresql-14.2-1-windows-x64-binaries\pgsql\bin>  pg_ctl -D ^"C^:^\pgsql^_data^" -l logfile start
https://roytuts.com/how-to-install-postgresql-zip-archive-in-windows/

install maven locallly without admin rights

https://stackoverflow.com/questions/44457619/can-i-use-maven-without-setting-the-environment-variable#:~:text=If%20you%20don't%20have%20admin%20rights%2C%20simply%20set%20the,maven%20setup%20in%20your%20system.


http://localhost:8080/vendor/search?company=testcompany1
http://localhost:8080/vendor/lookup?gstno=ABC
http://localhost:8080/vendor/lookup/ABC

[
{
"Id": 1,
"companyName": "XYZ",
"contactName": "XYZ person",
"lastname": "XYZ LastName",
"website": "XYZ.com",
"email": "XYZ@email.com",
"status": "A",
"gstno": "GSTXYZ",
"id": 1
},
{
"Id": 2,
"companyName": "ABC",
"contactName": "ABC person",
"lastname": "ABC LastName",
"website": "ABC.com",
"email": "ABC@email.com",
"status": "A",
"gstno": "GSTABC",
"id": 2
},
{
"Id": 3,
"companyName": "JKL",
"contactName": "JKL person",
"lastname": "JKL LastName",
"website": "JKL.com",
"email": "JKL@email.com",
"status": "A",
"gstno": "GSTJKL",
"id": 3
},
{
"Id": 4,
"companyName": "PQR",
"contactName": "PQR person",
"lastname": "PQR LastName",
"website": "PQR.com",
"email": "PQR@email.com",
"status": "A",
"gstno": "GSTPQR",
"id": 4
}
]

payload to test association between vendor and address table
	//payload
//	{
//        "companyName": "HHH",
//        "contactName": "HHH person",
//        "lastname": "HHH LastName",
//        "website": "HHH.com",
//        "email": "HHH@email.com",
//        "status": "A",
//        "gstno": "GSTHHH",
// 
//    "addressobject":[{
//    
//        "addressType": "H",
//        "street": "Lunea Knapp",
//        "city": "Hayden Nunez",
//        "country": "odio.sagittis.semper@icloud.org",
//        "region": "duis.gravida@hotmail.ca"
//      },
//     {
//        "addressType": "O",
//        "street": "Lunea Knapp2",
//        "city": "Hayden Nunez2",
//        "country": "odio.sagittis2.semper@icloud.org",
//        "region": "duis.gravida2@hotmail.ca"
// 
