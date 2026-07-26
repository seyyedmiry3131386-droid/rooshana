package ir.mservices.market.social.level.data;

import defpackage.b88;
import defpackage.c24;
import defpackage.js3;
import defpackage.no7;
import defpackage.px3;
import defpackage.qq1;
import defpackage.qv;
import defpackage.so7;
import defpackage.to7;
import defpackage.uz0;
import defpackage.wq2;
import defpackage.yd1;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class LevelDetailDto {
    private final String activityDetailText;
    private final List<ActivityDetailDto> activityDetails;
    private final XpDetailDto xpDetail;
    public static final Companion Companion = new Companion(null);
    private static final c24[] $childSerializers = {null, a.b(LazyThreadSafetyMode.b, new qq1(28)), null};

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final px3 serializer() {
            return LevelDetailDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LevelDetailDto(int i, String str, List list, XpDetailDto xpDetailDto, to7 to7Var) {
        if (7 != (i & 7)) {
            wq2.S(i, 7, LevelDetailDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.activityDetailText = str;
        this.activityDetails = list;
        this.xpDetail = xpDetailDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ px3 _childSerializers$_anonymous_() {
        return new qv(ActivityDetailDto$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelDetailDto copy$default(LevelDetailDto levelDetailDto, String str, List list, XpDetailDto xpDetailDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = levelDetailDto.activityDetailText;
        }
        if ((i & 2) != 0) {
            list = levelDetailDto.activityDetails;
        }
        if ((i & 4) != 0) {
            xpDetailDto = levelDetailDto.xpDetail;
        }
        return levelDetailDto.copy(str, list, xpDetailDto);
    }

    public static final /* synthetic */ void write$Self$MyKet_primaryClientProductMyketRelease(LevelDetailDto levelDetailDto, uz0 uz0Var, no7 no7Var) {
        c24[] c24VarArr = $childSerializers;
        uz0Var.z(no7Var, 0, b88.a, levelDetailDto.activityDetailText);
        uz0Var.z(no7Var, 1, (px3) c24VarArr[1].getValue(), levelDetailDto.activityDetails);
        uz0Var.z(no7Var, 2, XpDetailDto$$serializer.INSTANCE, levelDetailDto.xpDetail);
    }

    public final String component1() {
        return this.activityDetailText;
    }

    public final List<ActivityDetailDto> component2() {
        return this.activityDetails;
    }

    public final XpDetailDto component3() {
        return this.xpDetail;
    }

    public final LevelDetailDto copy(String str, List<ActivityDetailDto> list, XpDetailDto xpDetailDto) {
        return new LevelDetailDto(str, list, xpDetailDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelDetailDto)) {
            return false;
        }
        LevelDetailDto levelDetailDto = (LevelDetailDto) obj;
        return js3.i(this.activityDetailText, levelDetailDto.activityDetailText) && js3.i(this.activityDetails, levelDetailDto.activityDetails) && js3.i(this.xpDetail, levelDetailDto.xpDetail);
    }

    public final String getActivityDetailText() {
        return this.activityDetailText;
    }

    public final List<ActivityDetailDto> getActivityDetails() {
        return this.activityDetails;
    }

    public final XpDetailDto getXpDetail() {
        return this.xpDetail;
    }

    public int hashCode() {
        String str = this.activityDetailText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ActivityDetailDto> list = this.activityDetails;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        XpDetailDto xpDetailDto = this.xpDetail;
        return iHashCode2 + (xpDetailDto != null ? xpDetailDto.hashCode() : 0);
    }

    public String toString() {
        return "LevelDetailDto(activityDetailText=" + this.activityDetailText + ", activityDetails=" + this.activityDetails + ", xpDetail=" + this.xpDetail + ")";
    }

    public LevelDetailDto(String str, List<ActivityDetailDto> list, XpDetailDto xpDetailDto) {
        this.activityDetailText = str;
        this.activityDetails = list;
        this.xpDetail = xpDetailDto;
    }
}
