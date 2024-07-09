Feature:Bir kullanıcı olarak alışveriş yaptığım sitenin Katori açılır kapanır dropdown menü yönlendirme ikonlarını kullanarak istediğim sayfalara ulaşmak istiyorum.
  @AZ
  Scenario:The user accesses the relevant product pages via redirection icons.
  Given Go to "url"
  When Clicks the Login buttonLink on the home page
  And Login by entering valid "customerEmail" and "password" on the SignIn page.
  Then All Categories in the nav bar on the home page that the drop-down menu is visible verify.
  Then Go to the All Categories dropdown menu click.
