package ir.mservices.market.reels.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsEventDto implements Serializable {

    @vo7("finish")
    private final String finish;

    @vo7("pause")
    private final String pause;

    @vo7("restart")
    private final String restart;

    @vo7("scrollDown")
    private final String scrollDown;

    @vo7("scrollUp")
    private final String scrollUp;

    @vo7("start")
    private final String start;

    public AnalyticsEventDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.finish = str;
        this.pause = str2;
        this.restart = str3;
        this.scrollDown = str4;
        this.scrollUp = str5;
        this.start = str6;
    }

    public static /* synthetic */ AnalyticsEventDto copy$default(AnalyticsEventDto analyticsEventDto, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsEventDto.finish;
        }
        if ((i & 2) != 0) {
            str2 = analyticsEventDto.pause;
        }
        if ((i & 4) != 0) {
            str3 = analyticsEventDto.restart;
        }
        if ((i & 8) != 0) {
            str4 = analyticsEventDto.scrollDown;
        }
        if ((i & 16) != 0) {
            str5 = analyticsEventDto.scrollUp;
        }
        if ((i & 32) != 0) {
            str6 = analyticsEventDto.start;
        }
        String str7 = str5;
        String str8 = str6;
        return analyticsEventDto.copy(str, str2, str3, str4, str7, str8);
    }

    public final String component1() {
        return this.finish;
    }

    public final String component2() {
        return this.pause;
    }

    public final String component3() {
        return this.restart;
    }

    public final String component4() {
        return this.scrollDown;
    }

    public final String component5() {
        return this.scrollUp;
    }

    public final String component6() {
        return this.start;
    }

    public final AnalyticsEventDto copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new AnalyticsEventDto(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsEventDto)) {
            return false;
        }
        AnalyticsEventDto analyticsEventDto = (AnalyticsEventDto) obj;
        return js3.i(this.finish, analyticsEventDto.finish) && js3.i(this.pause, analyticsEventDto.pause) && js3.i(this.restart, analyticsEventDto.restart) && js3.i(this.scrollDown, analyticsEventDto.scrollDown) && js3.i(this.scrollUp, analyticsEventDto.scrollUp) && js3.i(this.start, analyticsEventDto.start);
    }

    public final String getFinish() {
        return this.finish;
    }

    public final String getPause() {
        return this.pause;
    }

    public final String getRestart() {
        return this.restart;
    }

    public final String getScrollDown() {
        return this.scrollDown;
    }

    public final String getScrollUp() {
        return this.scrollUp;
    }

    public final String getStart() {
        return this.start;
    }

    public int hashCode() {
        String str = this.finish;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pause;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.restart;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scrollDown;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scrollUp;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.start;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.finish;
        String str2 = this.pause;
        String str3 = this.restart;
        String str4 = this.scrollDown;
        String str5 = this.scrollUp;
        String str6 = this.start;
        StringBuilder sbT = rm7.t("AnalyticsEventDto(finish=", str, ", pause=", str2, ", restart=");
        o40.I(str3, ", scrollDown=", str4, ", scrollUp=", sbT);
        return dw1.p(str5, ", start=", str6, ")", sbT);
    }
}
