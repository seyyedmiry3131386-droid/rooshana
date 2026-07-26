package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SplashInfoDTO implements Serializable {
    private String lang;
    private int probability;
    private String text;

    public String getLang() {
        return this.lang;
    }

    public int getProbability() {
        return this.probability;
    }

    public String getText() {
        return this.text;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setProbability(int i) {
        this.probability = i;
    }

    public void setText(String str) {
        this.text = str;
    }
}
