package org.apache.commons.io.filefilter;

import defpackage.b0;
import defpackage.ig3;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public class AndFileFilter extends b0 implements Serializable {
    public final ArrayList a;

    public AndFileFilter(CanReadFileFilter canReadFileFilter, ig3 ig3Var) {
        if (ig3Var == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        ArrayList arrayList = new ArrayList(2);
        this.a = arrayList;
        arrayList.add(canReadFileFilter);
        arrayList.add(ig3Var);
    }

    @Override // defpackage.b0, defpackage.ig3, java.io.FileFilter
    public final boolean accept(File file) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((ig3) it.next()).accept(file)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.b0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    sb.append(",");
                }
                Object obj = arrayList.get(i);
                sb.append(obj == null ? Ssh2PublicKeyAlgorithmName.NULL : obj.toString());
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.b0, defpackage.ig3, java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((ig3) it.next()).accept(file, str)) {
                return false;
            }
        }
        return true;
    }
}
