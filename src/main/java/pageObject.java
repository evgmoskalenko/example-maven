//public class pageObject {
//
//    abstract class Elements {
//
//        public function tap() {
//            // code here...
//        }
//
//    }
//
//    interface UiElements {
//
//        public function click();
//
//    }
//
//    interface WaitedElements {
//
//        public function wait();
//
//    }
//
//    class UiWaitedElements extends Elements implements UiElements, WaitedElements {
//
//        public function tap()
//        {
//
//        }
//
//        public function click()
//        {
//
//        }
//
//        public function wait()
//        {
//
//        }
//
//    }
//
//    class Test {
//
//        public function click(UiElements $uiElements)
//        {
//            $uiElements->click();
//
//            return $this;
//        }
//
//        public function wait(WaitedElements $uiElements)
//        {
//            $uiElements->wait();
//
//            return $this;
//        }
//
//    }
//
//    $uiWaitedElements = new UiWaitedElements();
//
//    (new Test())->click($uiWaitedElements)->wait($uiWaitedElements);
//
//}
