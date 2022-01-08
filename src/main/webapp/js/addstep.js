var step = 2;
function add_step() {
  var div = document.getElementById("step-child");

  var p = document.createElement("p");
  p.append("Bước " + step);
  var input = document.createElement("textarea");
  input.name = "buoc" + step;
  input.className = "form-control-textarea-buoc";
  input.placeholder = "Hãy nhập các bước thực hiện";
  div.appendChild(p);
  div.appendChild(input);

  var file = document.createElement("input");
  file.type = "file";
  file.name = "hinhanh";
  file.id = "file-ip-" + step;
  file.accept = "image/*";
  file.onchange = function () {
    showPreview(event);
  };
  div.appendChild(file);

  var img = document.createElement("img");
  img.id = "file-ip-" + step + "-preview";
  img.name = "preview";
  div.appendChild(img);
  step++;
}