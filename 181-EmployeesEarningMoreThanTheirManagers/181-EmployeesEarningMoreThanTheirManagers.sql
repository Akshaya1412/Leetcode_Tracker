-- Last updated: 9/21/2026, 9:29:26 PM
select e2.name as Employee from employee e1 inner join employee e2 on e1.id=e2.managerID where e1.salary<e2.salary;
