package ir.mservices.market.social.mynet.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MynetHomeDto implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7("items")
    private final List<MynetItemsDto> items;

    public MynetHomeDto(List<MynetItemsDto> list, boolean z) {
        this.items = list;
        this.eol = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MynetHomeDto copy$default(MynetHomeDto mynetHomeDto, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mynetHomeDto.items;
        }
        if ((i & 2) != 0) {
            z = mynetHomeDto.eol;
        }
        return mynetHomeDto.copy(list, z);
    }

    public final List<MynetItemsDto> component1() {
        return this.items;
    }

    public final boolean component2() {
        return this.eol;
    }

    public final MynetHomeDto copy(List<MynetItemsDto> list, boolean z) {
        return new MynetHomeDto(list, z);
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MynetHomeDto)) {
            return false;
        }
        MynetHomeDto mynetHomeDto = (MynetHomeDto) obj;
        return js3.i(this.items, mynetHomeDto.items) && this.eol == mynetHomeDto.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<MynetItemsDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<MynetItemsDto> list = this.items;
        return ((list == null ? 0 : list.hashCode()) * 31) + (this.eol ? 1231 : 1237);
    }

    public String toString() {
        return "MynetHomeDto(items=" + this.items + ", eol=" + this.eol + ")";
    }
}
