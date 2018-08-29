package poo;

public class Tempo {
    private int sec;
    private int min;
    private int hora;

    public boolean setSec(int sec) {
        if ((sec >= 0) && (sec < 60)) {
            this.sec = sec;
            return true;
        }else{
            this.sec = 0;
            return false;
        }
    }

    public void setMin(int min) {
        if ((min >= 0) && (min < 60)) {
            this.min = min;
            return true;
        }else{
            this.min = 0;
            return false;
        }
    }

    public void setHora(int hora) {
        if ((hora >= 0) && (hora < 24)) {
            this.hora = hora;
            return true;
        }else{
            this.hora = 0;
            return false;
        }
    }

    public Tempo(int s){
        if ((s >= 0) && (s < 60)){
            sec = s;
        }else{
            sec = 0;
            min = 0;
            hora = 0;
        }
    }

    public Tempo(int s, int m){
        if ((s >= 0) && (s < 60)){
            if ((m >= 0) && (m < 60)){
                sec = s;
                min = m;
            }
        }else{
            sec = 0;
            min = 0;
            hora = 0;
        }
    }

    public Tempo(int s, int m, int h){
        if ((s >= 0) && (s < 60)){
            if ((m >= 0) && (m < 60)){
                if ((h >= 0) && (h < 24)){
                    sec = s;
                    min = m;
                    hora = h;
                }
            }
        }else{
            sec = 0;
            min = 0;
            hora = 0;
        }
    }

    public Tempo(){
        sec = 0;
        min = 0;
        hora = 0;
    }

    public String toString(){
        return hora +":"+ min +":"+ sec;
        System.out.println(hora+":"+min+":"+sec);
    }

    public toFormat(int x){
        if (x == 0){
            x = 00;
        }
    }


}
