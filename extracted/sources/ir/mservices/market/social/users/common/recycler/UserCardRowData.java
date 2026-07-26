package ir.mservices.market.social.users.common.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.social.users.common.data.UsersDto;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class UserCardRowData extends NestedRecyclerData implements g32, wo2 {
    public static final int j = js6.user_vertical_card_view;
    public static final int k = js6.user_horizontal_one_view;
    public static final int l = js6.user_horizontal_two_view;
    public static final int m = js6.user_horizontal_three_view;
    public final UsersDto g;
    public final bz6 h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCardRowData(UsersDto usersDto, bz6 bz6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(bz6Var, "recyclerData");
        this.g = usersDto;
        this.h = bz6Var;
        long j2 = is3.p + 1;
        is3.p = j2;
        this.i = String.valueOf(j2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        String mode = this.g.getMode();
        int iHashCode = mode.hashCode();
        int i = j;
        if (iHashCode == -1919497322) {
            mode.equals("Vertical");
            return i;
        }
        switch (iHashCode) {
            case 1734713453:
                if (mode.equals("Horizontal1")) {
                    return k;
                }
                return i;
            case 1734713454:
                if (mode.equals("Horizontal2")) {
                    return l;
                }
                return i;
            case 1734713455:
                if (mode.equals("Horizontal3")) {
                    return m;
                }
                return i;
            default:
                return i;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return this.g.getHorizontalType();
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCardRowData)) {
            return false;
        }
        UserCardRowData userCardRowData = (UserCardRowData) obj;
        return js3.i(this.g, userCardRowData.g) && js3.i(this.h, userCardRowData.h) && js3.i(this.i, userCardRowData.i);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + (this.g.hashCode() * 31)) * 31);
    }
}
