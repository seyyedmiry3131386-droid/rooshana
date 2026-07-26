package ir.mservices.market.common.search;

import defpackage.bl4;
import defpackage.js3;
import defpackage.o40;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchState implements Serializable {

    public static final class Home extends SearchState implements Serializable {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Home);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Home(obj=null)";
        }
    }

    public static final class Normal extends SearchState implements Serializable {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Normal);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Normal(obj=null)";
        }
    }

    public static final class Result extends SearchState implements Serializable {
        public final String a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Result(String str, String str2) {
            super(0);
            js3.p(str, "query");
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return js3.i(this.a, result.a) && js3.i(this.b, result.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return bl4.w("Result(query=", this.a, ", source=", this.b, ")");
        }
    }

    public static final class Suggestion extends SearchState implements Serializable {
        public final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Suggestion(String str) {
            super(0);
            js3.p(str, "query");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Suggestion) && js3.i(this.a, ((Suggestion) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return o40.y("Suggestion(query=", this.a, ")");
        }
    }

    public /* synthetic */ SearchState(int i) {
        this();
    }

    private SearchState() {
    }
}
