# pivottable
SprinBootApplication


$ git clone https://github.com/Kalashnikofffs/pivottable.git

$ cd {PROJECTPATH}

$ gradle  bootRun

or u can use compiled version

$gradle build

then 

$ cd build/libs

make sure that there is a data.sqlite file.

if not 

$gradle copyDatabase

then execute .jar

$ java -jar pivottable-0.0.1-SNAPSHOT.jar


then you can make a rest request to url:  http://localhost:8080/?row=a&col=y
and try different params.
