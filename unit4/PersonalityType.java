// ERIC XUE PD5

public class PersonalityType {
    private static int abcdefghijklmnopPOIURPOIUROPIURPOIURPOIURPOIURPOIUROPIU;
    private static final char fgjhfj[] = {'I', 'E', 'S', 'N', 'T', 'F', 'J', 'P'};
    public static int numberOfBs(Person brqihubrquhi129871239812789767777, int qepuqepuqepu){
        int tguhbtguhbtguhbtguhbtguhbtguhb = 0;
        abcdefghijklmnopPOIURPOIUROPIURPOIURPOIURPOIURPOIUROPIU = 0;
        for (int oiuyaeoiuyaeoiuyae=qepuqepuqepu*2-3; oiuyaeoiuyaeoiuyae<69; oiuyaeoiuyaeoiuyae+=7){
            if (qepuqepuqepu != 1 && brqihubrquhi129871239812789767777.getAnswers()[oiuyaeoiuyaeoiuyae]=='B') ++tguhbtguhbtguhbtguhbtguhbtguhb;
            if (brqihubrquhi129871239812789767777.getAnswers()[oiuyaeoiuyaeoiuyae+1]=='B') ++tguhbtguhbtguhbtguhbtguhbtguhb;
            
            ++abcdefghijklmnopPOIURPOIUROPIURPOIURPOIURPOIURPOIUROPIU;
            if (qepuqepuqepu != 1) ++abcdefghijklmnopPOIURPOIUROPIURPOIURPOIURPOIURPOIUROPIU;
        }
        return tguhbtguhbtguhbtguhbtguhbtguhb;
    }

    public static int percentOfBs(Person zxcmnbzxcmnbzxcmnbzxcmnbzxcmnb, int wefiuhwefiuhwefiuh){
        int wefoijwefoijwefoijwefoijwefoij = numberOfBs(zxcmnbzxcmnbzxcmnbzxcmnbzxcmnb, wefiuhwefiuhwefiuh);
        return 100*wefoijwefoijwefoijwefoijwefoij/abcdefghijklmnopPOIURPOIUROPIURPOIURPOIURPOIURPOIUROPIU;
    }

    public static String type(Person poiurpoiurpoiurpoiurpoiurpoiurpoiur){
        String qweasdzxc1359812390821350982315913871203957812395781 = "";
        
        for (int FROPIFROPIFRPOIFRPOI=0; FROPIFROPIFRPOIFRPOI<4; ++FROPIFROPIFRPOIFRPOI){
            int poiruopiruporiuropiur = percentOfBs(poiurpoiurpoiurpoiurpoiurpoiurpoiur, FROPIFROPIFRPOIFRPOI+1);
            int fgjhfgjGTUHBGTUHBGTUHBGUHBGTUHBGTUHBGTBGHBGHBGHGBGB = FROPIFROPIFRPOIFRPOI*2;
            if (poiruopiruporiuropiur >= 50) ++fgjhfgjGTUHBGTUHBGTUHBGUHBGTUHBGTUHBGTBGHBGHBGHGBGB;
            qweasdzxc1359812390821350982315913871203957812395781 += fgjhfj[fgjhfgjGTUHBGTUHBGTUHBGUHBGTUHBGTUHBGTBGHBGHBGHGBGB];
        }

        return qweasdzxc1359812390821350982315913871203957812395781;
    }
}
