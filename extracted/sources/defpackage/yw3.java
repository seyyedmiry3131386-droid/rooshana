package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KVisibility;

/* JADX INFO: loaded from: classes3.dex */
public interface yw3 extends xw3 {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    qx3 getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
