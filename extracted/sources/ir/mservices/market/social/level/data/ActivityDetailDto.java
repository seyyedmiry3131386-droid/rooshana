package ir.mservices.market.social.level.data;

import defpackage.b88;
import defpackage.dw1;
import defpackage.js3;
import defpackage.no7;
import defpackage.px3;
import defpackage.so7;
import defpackage.to7;
import defpackage.uz0;
import defpackage.wq2;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class ActivityDetailDto {
    public static final Companion Companion = new Companion(null);
    private final String color;
    private final int percent;
    private final String title;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final px3 serializer() {
            return ActivityDetailDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivityDetailDto(int i, int i2, String str, String str2, to7 to7Var) {
        if (7 != (i & 7)) {
            wq2.S(i, 7, ActivityDetailDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.percent = i2;
        this.title = str;
        this.color = str2;
    }

    public static /* synthetic */ ActivityDetailDto copy$default(ActivityDetailDto activityDetailDto, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = activityDetailDto.percent;
        }
        if ((i2 & 2) != 0) {
            str = activityDetailDto.title;
        }
        if ((i2 & 4) != 0) {
            str2 = activityDetailDto.color;
        }
        return activityDetailDto.copy(i, str, str2);
    }

    public static final /* synthetic */ void write$Self$MyKet_primaryClientProductMyketRelease(ActivityDetailDto activityDetailDto, uz0 uz0Var, no7 no7Var) {
        uz0Var.v(0, activityDetailDto.percent, no7Var);
        b88 b88Var = b88.a;
        uz0Var.z(no7Var, 1, b88Var, activityDetailDto.title);
        uz0Var.z(no7Var, 2, b88Var, activityDetailDto.color);
    }

    public final int component1() {
        return this.percent;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.color;
    }

    public final ActivityDetailDto copy(int i, String str, String str2) {
        return new ActivityDetailDto(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityDetailDto)) {
            return false;
        }
        ActivityDetailDto activityDetailDto = (ActivityDetailDto) obj;
        return this.percent == activityDetailDto.percent && js3.i(this.title, activityDetailDto.title) && js3.i(this.color, activityDetailDto.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i = this.percent * 31;
        String str = this.title;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.percent;
        String str = this.title;
        String str2 = this.color;
        StringBuilder sb = new StringBuilder("ActivityDetailDto(percent=");
        sb.append(i);
        sb.append(", title=");
        sb.append(str);
        sb.append(", color=");
        return dw1.s(sb, str2, ")");
    }

    public ActivityDetailDto(int i, String str, String str2) {
        this.percent = i;
        this.title = str;
        this.color = str2;
    }
}
