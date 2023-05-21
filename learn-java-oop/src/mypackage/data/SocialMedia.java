package mypackage.data;

class SocialMedia {
    String name;

    final void login(String username, String password) {
        System.out.println("Login");
    }
}

final class Facebook extends SocialMedia {
    /**
     * Error :
     * Because final method cannot override.
     */
//    void login(String username, String password) {
//
//    }
}

/**
 * Error:
 * Because final class cannot inherit
 */
//class FakeFacebook extends Facebook {
//
//}
