using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Rust.Jose.C.RNRustJoseC
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNRustJoseCModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNRustJoseCModule"/>.
        /// </summary>
        internal RNRustJoseCModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNRustJoseC";
            }
        }
    }
}
