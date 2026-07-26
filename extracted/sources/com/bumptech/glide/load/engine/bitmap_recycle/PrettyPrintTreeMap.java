package com.bumptech.glide.load.engine.bitmap_recycle;

import defpackage.bl4;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sbC = bl4.C("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sbC.append('{');
            sbC.append(entry.getKey());
            sbC.append(':');
            sbC.append(entry.getValue());
            sbC.append("}, ");
        }
        if (!isEmpty()) {
            sbC.replace(sbC.length() - 2, sbC.length(), "");
        }
        sbC.append(" )");
        return sbC.toString();
    }
}
