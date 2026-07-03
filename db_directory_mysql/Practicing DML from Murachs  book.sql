use ap;
show tables;

-- **************************
-- CAHPTER 03
-- **************************


-- SELECT

select *
from invoices;

SELECT * 
FROM invoices
WHERE payment_total > 2000
ORDER BY payment_total desc
LIMIT 10;


select * from invoices
where invoice_total > 1000;

select * from invoices
where invoice_total != payment_total;

select invoice_total - payment_total as balance
from invoices
where (invoice_total - payment_total) > 0;


select count(*)
from invoices
where (invoice_total - payment_total) > 0;


select invoice_id, invoice_total - payment_total as balance
from invoices
having balance > 0;

select invoice_id, v.vendor_id, invoice_total - payment_total as balance
from invoices i
join vendors v
on i.vendor_id = v.vendor_id
having balance > 0;

select invoice_id, v.vendor_id, invoice_total - payment_total as balance
from invoices i
join vendors v
on i.vendor_id = v.vendor_id
having balance > 0;


select count(*) from invoices
where invoice_total > 1000;

select count(*)
from invoices
where (invoice_total - payment_total) > 0;


select invoice_id
from invoices
where invoice_total - payment_total > 0 ;

SELECT invoice_id, invoice_total, payment_total, credit_total,
       (invoice_total - payment_total - credit_total) AS balance_due
FROM invoices
WHERE (invoice_total - payment_total - credit_total) > 0;

SELECT *
FROM invoices
WHERE invoice_date between '2011-06-01' and '2011-06-30';


-- CONCAT function


SELECT vendor_name, CONCAT(vendor_city,' ', vendor_state,' ', vendor_zip_code) as venodor_address
FROM vendors;

-- DISTINCT

SELECT vendor_city, vendor_state
FROM vendors;

SELECT DISTINCT vendor_city, vendor_state
FROM vendors;


-- GROUP BY

-- In MySQL, whenever you use aggregate functions like COUNT(), SUM(), AVG(), MAX(), etc., 
-- in the SELECT list along with regular columns, you must include those regular columns in a GROUP BY clause.

SELECT vendor_city, COUNT(*)
FROM vendors
GROUP BY  vendor_city;

SELECT vendor_city, vendor_state, COUNT(*) AS the_count
FROM vendors
GROUP BY vendor_city, vendor_state;




