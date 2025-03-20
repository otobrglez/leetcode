SELECT firstName, lastName, city, state
FROM person
         LEFT OUTER JOIN combine_two_tables.address a on person.personid = a.personid;
