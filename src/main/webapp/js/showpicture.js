var pic = 0;
      function showPreview(event) {
        if (event.target.files.length > 0) {
          var src = URL.createObjectURL(event.target.files[0]);
          var preview = document.getElementById("file-ip-" + pic + "-preview");
          preview.src = src;
          preview.style.width = "200px";
          preview.style.height = "auto";
          preview.style.display = "block";
          pic++;
        }
      }