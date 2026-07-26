package androidx.compose.foundation.text;

import defpackage.by3;
import defpackage.pj9;
import defpackage.r79;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final pj9 a = new pj9(new r79(23, new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
        @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.mx3
        public final Object get(Object obj) {
            return Boolean.valueOf(((by3) obj).a.isCtrlPressed());
        }
    }));
}
