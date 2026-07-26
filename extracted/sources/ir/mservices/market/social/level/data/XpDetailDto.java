package ir.mservices.market.social.level.data;

import defpackage.b88;
import defpackage.bl4;
import defpackage.dw1;
import defpackage.js3;
import defpackage.no7;
import defpackage.o40;
import defpackage.px3;
import defpackage.so7;
import defpackage.to7;
import defpackage.uz0;
import defpackage.wq2;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class XpDetailDto {
    public static final Companion Companion = new Companion(null);
    private final int exactXP;
    private final int levelEnd;
    private final int levelStart;
    private final String xpColor;
    private final int xpLevel;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final px3 serializer() {
            return XpDetailDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ XpDetailDto(int i, int i2, int i3, int i4, int i5, String str, to7 to7Var) {
        if (31 != (i & 31)) {
            wq2.S(i, 31, XpDetailDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.levelStart = i2;
        this.exactXP = i3;
        this.levelEnd = i4;
        this.xpLevel = i5;
        this.xpColor = str;
    }

    public static /* synthetic */ XpDetailDto copy$default(XpDetailDto xpDetailDto, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = xpDetailDto.levelStart;
        }
        if ((i5 & 2) != 0) {
            i2 = xpDetailDto.exactXP;
        }
        if ((i5 & 4) != 0) {
            i3 = xpDetailDto.levelEnd;
        }
        if ((i5 & 8) != 0) {
            i4 = xpDetailDto.xpLevel;
        }
        if ((i5 & 16) != 0) {
            str = xpDetailDto.xpColor;
        }
        String str2 = str;
        int i6 = i3;
        return xpDetailDto.copy(i, i2, i6, i4, str2);
    }

    public static final /* synthetic */ void write$Self$MyKet_primaryClientProductMyketRelease(XpDetailDto xpDetailDto, uz0 uz0Var, no7 no7Var) {
        uz0Var.v(0, xpDetailDto.levelStart, no7Var);
        uz0Var.v(1, xpDetailDto.exactXP, no7Var);
        uz0Var.v(2, xpDetailDto.levelEnd, no7Var);
        uz0Var.v(3, xpDetailDto.xpLevel, no7Var);
        uz0Var.z(no7Var, 4, b88.a, xpDetailDto.xpColor);
    }

    public final int component1() {
        return this.levelStart;
    }

    public final int component2() {
        return this.exactXP;
    }

    public final int component3() {
        return this.levelEnd;
    }

    public final int component4() {
        return this.xpLevel;
    }

    public final String component5() {
        return this.xpColor;
    }

    public final XpDetailDto copy(int i, int i2, int i3, int i4, String str) {
        return new XpDetailDto(i, i2, i3, i4, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XpDetailDto)) {
            return false;
        }
        XpDetailDto xpDetailDto = (XpDetailDto) obj;
        return this.levelStart == xpDetailDto.levelStart && this.exactXP == xpDetailDto.exactXP && this.levelEnd == xpDetailDto.levelEnd && this.xpLevel == xpDetailDto.xpLevel && js3.i(this.xpColor, xpDetailDto.xpColor);
    }

    public final int getExactXP() {
        return this.exactXP;
    }

    public final int getLevelEnd() {
        return this.levelEnd;
    }

    public final int getLevelStart() {
        return this.levelStart;
    }

    public final String getXpColor() {
        return this.xpColor;
    }

    public final int getXpLevel() {
        return this.xpLevel;
    }

    public int hashCode() {
        int i = ((((((this.levelStart * 31) + this.exactXP) * 31) + this.levelEnd) * 31) + this.xpLevel) * 31;
        String str = this.xpColor;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.levelStart;
        int i2 = this.exactXP;
        int i3 = this.levelEnd;
        int i4 = this.xpLevel;
        String str = this.xpColor;
        StringBuilder sbB = bl4.B(i, i2, "XpDetailDto(levelStart=", ", exactXP=", ", levelEnd=");
        o40.J(sbB, i3, ", xpLevel=", i4, ", xpColor=");
        return dw1.s(sbB, str, ")");
    }

    public XpDetailDto(int i, int i2, int i3, int i4, String str) {
        this.levelStart = i;
        this.exactXP = i2;
        this.levelEnd = i3;
        this.xpLevel = i4;
        this.xpColor = str;
    }
}
