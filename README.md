# openapi
 Simple api
 
**Procedure1:**
```
ALTER PROCEDURE [dbo].[GET_COUNT_FROM_SERVICES] 
  --@count_out INT  OUT
 AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT COUNT(*) As RowCont  FROM invoices
END
```

**Procedure2:**
```
ALTER PROCEDURE [dbo].[GET_ALL_DATA] 
AS  
BEGIN  
    -- SET NOCOUNT ON added to prevent extra result sets from  
    -- interfering with SELECT statements.  
    SET NOCOUNT ON;  
  
    -- Select statements for procedure here  
    SELECT * FROM invoices 
END 
```
**Procedure3 :**
```
ALTER PROCEDURE  [dbo].[GET_DATA_FROM_INVOICES_BY_ID] @id_in INT 
	AS
   SELECT * FROM invoices WHERE id=@id_in ORDER BY id;
 GO
```

Demo 1
<img src="https://raw.githubusercontent.com/worldthem/openapi/main/demo1.jpg">
Demo 2
<img src="https://raw.githubusercontent.com/worldthem/openapi/main/demo2.jpg">
Demo 3
<img src="https://raw.githubusercontent.com/worldthem/openapi/main/demo3.jpg">

Procedures
<img src="https://raw.githubusercontent.com/worldthem/openapi/main/demo4.jpg">
