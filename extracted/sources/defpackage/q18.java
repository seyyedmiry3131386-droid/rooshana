package defpackage;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface q18 extends oa5, p18 {
    q18 D0(Object obj, BoundType boundType);

    q18 J();

    NavigableSet b();

    @Override // defpackage.p18
    Comparator comparator();

    @Override // defpackage.oa5
    Set entrySet();

    pa5 firstEntry();

    q18 h1(Object obj, BoundType boundType, Object obj2, BoundType boundType2);

    q18 k0(Object obj, BoundType boundType);

    pa5 lastEntry();

    pa5 pollFirstEntry();

    pa5 pollLastEntry();
}
