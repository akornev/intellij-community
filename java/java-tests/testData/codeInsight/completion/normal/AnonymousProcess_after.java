import java.util.*;

public class Runner {
  public static void main(String[] args) {
    List<Process> src;
    List<Process> dest = ListUtils.filter(src, new Pred<Process>() {
        @Override
        public boolean predicate(Process elem) {
            <selection><caret>return false;  //To change body of implemented methods use File | Settings | File Templates.</selection>
        }
    });
  }
}