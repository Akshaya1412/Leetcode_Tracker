-- Last updated: 9/21/2026, 9:29:27 PM
select Person.firstName,Person.lastName,Address.city,Address.state from Person left join Address on Person.personId=Address.personId;
