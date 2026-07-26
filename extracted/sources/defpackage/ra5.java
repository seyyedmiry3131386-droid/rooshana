package defpackage;

import com.google.common.collect.MutableClassToInstanceMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ra5 extends zj2 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Map.Entry t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra5(Map.Entry entry, int i) {
        super(16);
        this.s = i;
        this.t = entry;
    }

    @Override // defpackage.hs9
    public final Object A() {
        switch (this.s) {
        }
        return this.t;
    }

    @Override // defpackage.zj2
    public final Map.Entry Y() {
        switch (this.s) {
        }
        return this.t;
    }

    @Override // defpackage.zj2, java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.s) {
            case 1:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (s7.l(getKey(), entry.getKey()) && s7.l(getValue(), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // defpackage.zj2, java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.s) {
            case 0:
                MutableClassToInstanceMap.Z((Class) getKey(), obj);
                break;
            default:
                obj.getClass();
                break;
        }
        return super.setValue(obj);
    }
}
