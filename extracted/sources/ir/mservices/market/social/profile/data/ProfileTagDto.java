package ir.mservices.market.social.profile.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileTagDto implements Serializable {

    @vo7("age")
    private final TagItem age;

    @vo7("city")
    private final TagItem city;

    @vo7("followerCount")
    private final TagItem followerCount;

    @vo7("gender")
    private final TagItem gender;

    @vo7("register")
    private final TagItem register;

    public ProfileTagDto(TagItem tagItem, TagItem tagItem2, TagItem tagItem3, TagItem tagItem4, TagItem tagItem5) {
        this.register = tagItem;
        this.age = tagItem2;
        this.city = tagItem3;
        this.gender = tagItem4;
        this.followerCount = tagItem5;
    }

    public static /* synthetic */ ProfileTagDto copy$default(ProfileTagDto profileTagDto, TagItem tagItem, TagItem tagItem2, TagItem tagItem3, TagItem tagItem4, TagItem tagItem5, int i, Object obj) {
        if ((i & 1) != 0) {
            tagItem = profileTagDto.register;
        }
        if ((i & 2) != 0) {
            tagItem2 = profileTagDto.age;
        }
        if ((i & 4) != 0) {
            tagItem3 = profileTagDto.city;
        }
        if ((i & 8) != 0) {
            tagItem4 = profileTagDto.gender;
        }
        if ((i & 16) != 0) {
            tagItem5 = profileTagDto.followerCount;
        }
        TagItem tagItem6 = tagItem5;
        TagItem tagItem7 = tagItem3;
        return profileTagDto.copy(tagItem, tagItem2, tagItem7, tagItem4, tagItem6);
    }

    public final TagItem component1() {
        return this.register;
    }

    public final TagItem component2() {
        return this.age;
    }

    public final TagItem component3() {
        return this.city;
    }

    public final TagItem component4() {
        return this.gender;
    }

    public final TagItem component5() {
        return this.followerCount;
    }

    public final ProfileTagDto copy(TagItem tagItem, TagItem tagItem2, TagItem tagItem3, TagItem tagItem4, TagItem tagItem5) {
        return new ProfileTagDto(tagItem, tagItem2, tagItem3, tagItem4, tagItem5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileTagDto)) {
            return false;
        }
        ProfileTagDto profileTagDto = (ProfileTagDto) obj;
        return js3.i(this.register, profileTagDto.register) && js3.i(this.age, profileTagDto.age) && js3.i(this.city, profileTagDto.city) && js3.i(this.gender, profileTagDto.gender) && js3.i(this.followerCount, profileTagDto.followerCount);
    }

    public final TagItem getAge() {
        return this.age;
    }

    public final TagItem getCity() {
        return this.city;
    }

    public final TagItem getFollowerCount() {
        return this.followerCount;
    }

    public final TagItem getGender() {
        return this.gender;
    }

    public final TagItem getRegister() {
        return this.register;
    }

    public int hashCode() {
        TagItem tagItem = this.register;
        int iHashCode = (tagItem == null ? 0 : tagItem.hashCode()) * 31;
        TagItem tagItem2 = this.age;
        int iHashCode2 = (iHashCode + (tagItem2 == null ? 0 : tagItem2.hashCode())) * 31;
        TagItem tagItem3 = this.city;
        int iHashCode3 = (iHashCode2 + (tagItem3 == null ? 0 : tagItem3.hashCode())) * 31;
        TagItem tagItem4 = this.gender;
        int iHashCode4 = (iHashCode3 + (tagItem4 == null ? 0 : tagItem4.hashCode())) * 31;
        TagItem tagItem5 = this.followerCount;
        return iHashCode4 + (tagItem5 != null ? tagItem5.hashCode() : 0);
    }

    public String toString() {
        return "ProfileTagDto(register=" + this.register + ", age=" + this.age + ", city=" + this.city + ", gender=" + this.gender + ", followerCount=" + this.followerCount + ")";
    }
}
