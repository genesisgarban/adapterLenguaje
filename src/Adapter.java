public class Adapter implements IConnectionEnglish {

    private IConnectionNoEnglish noEnglish;
    public  Adapter(IConnectionNoEnglish noEnglish){
      this.noEnglish = noEnglish;
    }


    public void connection() {
this.noEnglish.connection();
    }
    public String runQuery() {
return  this.noEnglish.executeSentence();
    }

}
