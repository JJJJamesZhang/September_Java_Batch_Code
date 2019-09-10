

create table `EmployeeDetails` ( `EmpId` int not null, `FullName` varchar(255) not null, `ManagerId` int not null, `DateOfJoining` date, PRIMARY KEY (`EmpId`));

Create table `EmployeeSalary` (`EmpId` int not null, `Project` varchar(255) not null, Salary int not null, primary key (`EmpId`));

insert into `EmployeeDetails` ( EmpId, FullName, ManagerId, DateOfJoining )  Values (121, 'John Snow', 321, 20140131 ) , (  321, 'Walter White', 986, 20150130 ) , ( 421 , 'Kuldeep Rana', 876, 20161127 ) , (521, 'Sansa Stark', 876, 2017-12-02) , (621, 'Sansa Stark', 876, 2017-12-02);

insert into `EmployeeSalary` (`EmpId` , `Project`, `Salary`) values (121,'P1', 8000) ,(321, 'P2', 1000), (421, 'P1', 12000) , (721, 'P3', 6000);

select count(*) as count from EmployeeSalary where Project = 'P1';
select FullName from EmployeeDetails where EmpId in (select EmpId from EmployeeSalary where Salary between 5000 and 10000);
select count(*) as count from EmployeeSalary group by Project order by count desc;
select Project from EmployeeSalary group by Project having count(*) > 1;
select d.FullName , ifnull( s.Salary,0)  from EmployeeDetails d left join EmployeeSalary s on d.EmpId = s.EmpId;
select EmpId from EmployeeDetails where EmpId in (select ManagerId from EmployeeDetails);
select FullName from EmployeeDetails group by FullName having count(*) > 1;
select * from EmployeeDetails where EmpId not in (select EmpId from EmployeeSalary);
select now();
select * from EmployeeDetails where DateOfJoining between '20160101' and '20161231';
select d.FullName, s.Salary from EmployeeDetails d left join EmployeeSalary s on d.EmpId = s.EmpId where d.DateOfJoining between '20150101' and '20150131'