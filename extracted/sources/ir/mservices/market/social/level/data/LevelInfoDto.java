package ir.mservices.market.social.level.data;

import defpackage.b88;
import defpackage.dw1;
import defpackage.js3;
import defpackage.no7;
import defpackage.o40;
import defpackage.px3;
import defpackage.rm7;
import defpackage.so7;
import defpackage.to7;
import defpackage.uz0;
import defpackage.wq2;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class LevelInfoDto {
    public static final Companion Companion = new Companion(null);
    private final String iconUrl;
    private final String subtitle;
    private final String title;
    private final String value;
    private final String valueIconUrl;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final px3 serializer() {
            return LevelInfoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LevelInfoDto(int i, String str, String str2, String str3, String str4, String str5, to7 to7Var) {
        if (31 != (i & 31)) {
            wq2.S(i, 31, LevelInfoDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.iconUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.value = str4;
        this.valueIconUrl = str5;
    }

    public static /* synthetic */ LevelInfoDto copy$default(LevelInfoDto levelInfoDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = levelInfoDto.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = levelInfoDto.title;
        }
        if ((i & 4) != 0) {
            str3 = levelInfoDto.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = levelInfoDto.value;
        }
        if ((i & 16) != 0) {
            str5 = levelInfoDto.valueIconUrl;
        }
        String str6 = str5;
        String str7 = str3;
        return levelInfoDto.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$MyKet_primaryClientProductMyketRelease(LevelInfoDto levelInfoDto, uz0 uz0Var, no7 no7Var) {
        b88 b88Var = b88.a;
        uz0Var.z(no7Var, 0, b88Var, levelInfoDto.iconUrl);
        uz0Var.z(no7Var, 1, b88Var, levelInfoDto.title);
        uz0Var.z(no7Var, 2, b88Var, levelInfoDto.subtitle);
        uz0Var.z(no7Var, 3, b88Var, levelInfoDto.value);
        uz0Var.z(no7Var, 4, b88Var, levelInfoDto.valueIconUrl);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.value;
    }

    public final String component5() {
        return this.valueIconUrl;
    }

    public final LevelInfoDto copy(String str, String str2, String str3, String str4, String str5) {
        return new LevelInfoDto(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelInfoDto)) {
            return false;
        }
        LevelInfoDto levelInfoDto = (LevelInfoDto) obj;
        return js3.i(this.iconUrl, levelInfoDto.iconUrl) && js3.i(this.title, levelInfoDto.title) && js3.i(this.subtitle, levelInfoDto.subtitle) && js3.i(this.value, levelInfoDto.value) && js3.i(this.valueIconUrl, levelInfoDto.valueIconUrl);
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getValueIconUrl() {
        return this.valueIconUrl;
    }

    public int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.value;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.valueIconUrl;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.value;
        String str5 = this.valueIconUrl;
        StringBuilder sbT = rm7.t("LevelInfoDto(iconUrl=", str, ", title=", str2, ", subtitle=");
        o40.I(str3, ", value=", str4, ", valueIconUrl=", sbT);
        return dw1.s(sbT, str5, ")");
    }

    public LevelInfoDto(String str, String str2, String str3, String str4, String str5) {
        this.iconUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.value = str4;
        this.valueIconUrl = str5;
    }
}
