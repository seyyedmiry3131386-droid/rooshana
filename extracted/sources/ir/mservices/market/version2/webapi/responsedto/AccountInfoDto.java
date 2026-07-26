package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AccountInfoDto extends ResultDTO implements Serializable {
    private String avatarUrl;
    private int delayInSec;
    private boolean hasPass;
    private boolean isPhoneBinding;
    private boolean isVoiceMsgEnable;
    private int ln;
    private String nickname;
    private List<String> senders;

    public AccountInfoDto(int i, String str, String str2) {
        super(i, str, str2);
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public int getDelayInSec() {
        return this.delayInSec;
    }

    public int getLength() {
        return this.ln;
    }

    public String getNickname() {
        return this.nickname;
    }

    public List<String> getSenders() {
        return this.senders;
    }

    public boolean hasPass() {
        return this.hasPass;
    }

    public boolean isPhoneBinding() {
        return this.isPhoneBinding;
    }

    public boolean isVoiceMsgEnable() {
        return this.isVoiceMsgEnable;
    }

    public AccountInfoDto(int i, String str, String str2, String str3, String str4) {
        super(i, str, str2);
        this.avatarUrl = str3;
        this.nickname = str4;
    }
}
