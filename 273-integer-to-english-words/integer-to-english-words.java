class Solution {

    String[] less_20 = {
        "","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
        "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
    };

    String[] less_100 ={
        "","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"
    };

    String[] less_1000 ={
        "","Thousand","Million","Billion"
    };
    public String numberToWords(int num) {
        if(num == 0) return "Zero";

        int i = 0 ;

        String words = "";

        while(num > 0){

            if(num%1000 != 0){
                words = getVal(num%1000)+less_1000[i]+ " "+words;
            }
            i++;
            num /=1000;
        }

        return words.trim();
    }

    public String getVal(int num){
        if(num == 0){
            return "";
        }else if(num < 20){
            return less_20[num] + " ";
        }else if(num < 100){
            return less_100[num/10] + " "+getVal(num%10);
        }else {

            return less_20[num/100] + " Hundred " + getVal(num%100);
        }
    }
}