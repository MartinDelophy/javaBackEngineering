import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class StartGen {
    public static  final Integer ThreadSize =3;
    public   static ExecutorService executorService =null;
    //填入生成的表名
    public String[] table ={
          "enterprise_hurried_phone"
    };

    StartGen(){
        this.executorService = Executors.newFixedThreadPool(ThreadSize);
        AtomicInteger count =new AtomicInteger(0);
        this.executorService.execute(()-> {

            while(count.get()< table.length){
                new GenEntityMysql(table[count.get()].toUpperCase());
                count.incrementAndGet();
            }


        });
    }

    public static void main(String[] args) {
        new StartGen();




    }
}
