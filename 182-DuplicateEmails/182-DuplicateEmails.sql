-- Last updated: 9/21/2026, 9:29:22 PM
select email as Email from Person group by email having count(email)>1;
