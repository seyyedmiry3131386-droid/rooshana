package ir.mservices.market.setting.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;

/* JADX INFO: loaded from: classes3.dex */
public class SettingSimpleData extends SettingData implements g32 {
    public static final int f = js6.setting_simple_item;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;

    public SettingSimpleData(String str, int i, int i2) {
        super(str);
        this.b = i;
        this.c = i2;
        this.d = true;
        long j = is3.p + 1;
        is3.p = j;
        this.e = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public int U() {
        return f;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        SettingSimpleData settingSimpleData = (SettingSimpleData) obj;
        return js3.i(this.e, settingSimpleData.e) && this.c == settingSimpleData.c && this.d == settingSimpleData.d;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.e;
    }

    public int hashCode() {
        return (this.e.hashCode() + (this.d ? 1231 : 1237) + this.c) * 31;
    }
}
