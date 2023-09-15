//
//  ComposeView.swift
//  iosApp
//
//  Created by Manish Rajesh on 15/09/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import shared
import SwiftUI

struct ComposeView : UIViewControllerRepresentable{

    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {}
    
    func makeUIViewController(context: Context) -> some UIViewController {
       AppKt.mainViewController()
    }
    
}
