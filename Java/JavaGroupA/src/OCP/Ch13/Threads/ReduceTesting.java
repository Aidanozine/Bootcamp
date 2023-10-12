package OCP.Ch13.Threads;

import java.util.List;

public class ReduceTesting {
    public static void main(String[] args) {
        System.out.println(List.of('c','a','n','i','s',' ','l','u','p','u','s')
                .parallelStream()
                .reduce("",
                        (s1,c) ->
                                s1 + c,
                        (s2,s3) ->
                                s2 + s3)); // wolf
    }
}
