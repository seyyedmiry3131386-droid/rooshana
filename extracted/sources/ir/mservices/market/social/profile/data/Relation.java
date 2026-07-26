package ir.mservices.market.social.profile.data;

import defpackage.js3;
import defpackage.r22;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import java.util.Iterator;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Relation {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ Relation[] $VALUES;
    public static final Companion Companion;
    private final String value;
    public static final Relation NONE = new Relation("NONE", 0, ApplicationStateDto.STATE_NONE);
    public static final Relation PENDING = new Relation("PENDING", 1, "Pending");
    public static final Relation FOLLOW = new Relation("FOLLOW", 2, "Follow");

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final Relation getByValue(String str) {
            Object next;
            Iterator<E> it = Relation.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (js3.i(((Relation) next).getValue(), str)) {
                    break;
                }
            }
            Relation relation = (Relation) next;
            return relation == null ? Relation.NONE : relation;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Relation[] $values() {
        return new Relation[]{NONE, PENDING, FOLLOW};
    }

    static {
        Relation[] relationArr$values = $values();
        $VALUES = relationArr$values;
        $ENTRIES = a.a(relationArr$values);
        Companion = new Companion(null);
    }

    private Relation(String str, int i, String str2) {
        this.value = str2;
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static Relation valueOf(String str) {
        return (Relation) Enum.valueOf(Relation.class, str);
    }

    public static Relation[] values() {
        return (Relation[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
